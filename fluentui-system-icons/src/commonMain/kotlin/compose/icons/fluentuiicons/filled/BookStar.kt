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

public val FilledGroup.BookStar: ImageVector
    get() {
        if (_bookStar != null) {
            return _bookStar!!
        }
        _bookStar = Builder(name = "BookStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6f, 9.5275f)
                curveTo(11.5012f, 9.7276f, 11.3103f, 9.8663f, 11.0894f, 9.8984f)
                lineTo(9.6358f, 10.1096f)
                lineTo(10.6876f, 11.1349f)
                curveTo(10.8474f, 11.2907f, 10.9204f, 11.5152f, 10.8826f, 11.7351f)
                lineTo(10.6343f, 13.1829f)
                lineTo(11.9345f, 12.4993f)
                curveTo(12.132f, 12.3955f, 12.368f, 12.3955f, 12.5656f, 12.4993f)
                lineTo(13.8657f, 13.1829f)
                lineTo(13.6174f, 11.7351f)
                curveTo(13.5797f, 11.5152f, 13.6526f, 11.2907f, 13.8124f, 11.1349f)
                lineTo(14.8643f, 10.1096f)
                lineTo(13.4107f, 9.8984f)
                curveTo(13.1898f, 9.8663f, 12.9989f, 9.7276f, 12.9001f, 9.5275f)
                lineTo(12.25f, 8.2103f)
                lineTo(11.6f, 9.5275f)
                close()
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(10.5416f, 8.6076f)
                lineTo(8.0811f, 8.9651f)
                curveTo(7.5249f, 9.0459f, 7.3028f, 9.7294f, 7.7053f, 10.1217f)
                lineTo(9.4857f, 11.8572f)
                lineTo(9.0654f, 14.3078f)
                curveTo(8.9704f, 14.8617f, 9.5518f, 15.2842f, 10.0493f, 15.0226f)
                lineTo(12.25f, 13.8656f)
                lineTo(14.4508f, 15.0226f)
                curveTo(14.9482f, 15.2842f, 15.5297f, 14.8617f, 15.4347f, 14.3078f)
                lineTo(15.0143f, 11.8572f)
                lineTo(16.7948f, 10.1217f)
                curveTo(17.1972f, 9.7294f, 16.9752f, 9.0459f, 16.419f, 8.9651f)
                lineTo(13.9585f, 8.6076f)
                lineTo(12.8581f, 6.378f)
                curveTo(12.6094f, 5.874f, 11.8907f, 5.874f, 11.642f, 6.378f)
                lineTo(10.5416f, 8.6076f)
                close()
            }
        }
        .build()
        return _bookStar!!
    }

private var _bookStar: ImageVector? = null
