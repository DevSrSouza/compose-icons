package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TextboxAlignTop: ImageVector
    get() {
        if (_textboxAlignTop != null) {
            return _textboxAlignTop!!
        }
        _textboxAlignTop = Builder(name = "TextboxAlignTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 4.5f, 19.5f, 5.0596f, 19.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(19.5f, 18.9404f, 18.9404f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 19.5f, 4.5f, 18.9404f, 4.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.0596f, 5.0596f, 4.5f, 5.75f, 4.5f)
                close()
                moveTo(6.75f, 7.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 7.5f, 18.0f, 7.8358f, 18.0f, 8.25f)
                curveTo(18.0f, 8.6297f, 17.7178f, 8.9435f, 17.3518f, 8.9931f)
                lineTo(17.25f, 9.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 9.0f, 6.0f, 8.6642f, 6.0f, 8.25f)
                curveTo(6.0f, 7.8703f, 6.2821f, 7.5565f, 6.6482f, 7.5068f)
                lineTo(6.75f, 7.5f)
                close()
                moveTo(17.25f, 10.5f)
                horizontalLineTo(6.75f)
                lineTo(6.6482f, 10.5068f)
                curveTo(6.2821f, 10.5565f, 6.0f, 10.8703f, 6.0f, 11.25f)
                curveTo(6.0f, 11.6642f, 6.3358f, 12.0f, 6.75f, 12.0f)
                horizontalLineTo(17.25f)
                lineTo(17.3518f, 11.9932f)
                curveTo(17.7178f, 11.9435f, 18.0f, 11.6297f, 18.0f, 11.25f)
                curveTo(18.0f, 10.8358f, 17.6642f, 10.5f, 17.25f, 10.5f)
                close()
            }
        }
        .build()
        return _textboxAlignTop!!
    }

private var _textboxAlignTop: ImageVector? = null
