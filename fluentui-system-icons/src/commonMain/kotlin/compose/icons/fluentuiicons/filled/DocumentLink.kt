package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentLink: ImageVector
    get() {
        if (_documentLink != null) {
            return _documentLink!!
        }
        _documentLink = Builder(name = "DocumentLink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(13.0004f)
                curveTo(13.6281f, 21.1643f, 14.0f, 20.1256f, 14.0f, 19.0f)
                curveTo(14.0f, 16.2386f, 11.7614f, 14.0f, 9.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.8954f, 4.8954f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(5.75f, 15.75f)
                curveTo(5.75f, 15.3358f, 5.4142f, 15.0f, 5.0f, 15.0f)
                lineTo(4.8004f, 15.0049f)
                curveTo(2.684f, 15.1089f, 1.0f, 16.8578f, 1.0f, 19.0f)
                curveTo(1.0f, 21.2091f, 2.7909f, 23.0f, 5.0f, 23.0f)
                lineTo(5.1018f, 22.9932f)
                curveTo(5.4679f, 22.9435f, 5.75f, 22.6297f, 5.75f, 22.25f)
                curveTo(5.75f, 21.8358f, 5.4142f, 21.5f, 5.0f, 21.5f)
                lineTo(4.8356f, 21.4947f)
                curveTo(3.5315f, 21.41f, 2.5f, 20.3255f, 2.5f, 19.0f)
                curveTo(2.5f, 17.6193f, 3.6193f, 16.5f, 5.0f, 16.5f)
                lineTo(5.1018f, 16.4932f)
                curveTo(5.4679f, 16.4435f, 5.75f, 16.1297f, 5.75f, 15.75f)
                close()
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 16.7909f, 11.2091f, 15.0f, 9.0f, 15.0f)
                lineTo(8.8982f, 15.0068f)
                curveTo(8.5322f, 15.0565f, 8.25f, 15.3703f, 8.25f, 15.75f)
                curveTo(8.25f, 16.1642f, 8.5858f, 16.5f, 9.0f, 16.5f)
                lineTo(9.1644f, 16.5053f)
                curveTo(10.4685f, 16.59f, 11.5f, 17.6745f, 11.5f, 19.0f)
                curveTo(11.5f, 20.3807f, 10.3807f, 21.5f, 9.0f, 21.5f)
                lineTo(8.8982f, 21.5068f)
                curveTo(8.5322f, 21.5565f, 8.25f, 21.8703f, 8.25f, 22.25f)
                curveTo(8.25f, 22.6642f, 8.5858f, 23.0f, 9.0f, 23.0f)
                lineTo(9.1996f, 22.9951f)
                curveTo(11.316f, 22.8911f, 13.0f, 21.1422f, 13.0f, 19.0f)
                close()
                moveTo(8.75f, 18.25f)
                horizontalLineTo(5.25f)
                lineTo(5.1482f, 18.2568f)
                curveTo(4.7821f, 18.3065f, 4.5f, 18.6203f, 4.5f, 19.0f)
                curveTo(4.5f, 19.4142f, 4.8358f, 19.75f, 5.25f, 19.75f)
                horizontalLineTo(8.75f)
                lineTo(8.8518f, 19.7432f)
                curveTo(9.2178f, 19.6935f, 9.5f, 19.3797f, 9.5f, 19.0f)
                curveTo(9.5f, 18.5858f, 9.1642f, 18.25f, 8.75f, 18.25f)
                close()
            }
        }
        .build()
        return _documentLink!!
    }

private var _documentLink: ImageVector? = null
