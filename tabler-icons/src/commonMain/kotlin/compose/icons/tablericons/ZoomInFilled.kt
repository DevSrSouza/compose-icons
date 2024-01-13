package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ZoomInFilled: ImageVector
    get() {
        if (_zoomInFilled != null) {
            return _zoomInFilled!!
        }
        _zoomInFilled = Builder(name = "ZoomInFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.072f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.617f, 11.424f)
                lineToRelative(4.944f, 4.943f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.008f, 2.225f)
                lineToRelative(-0.114f, -0.103f)
                lineToRelative(-4.943f, -4.944f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.49f, -6.332f)
                lineToRelative(-0.006f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.995f, -6.643f)
                close()
                moveTo(10.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _zoomInFilled!!
    }

private var _zoomInFilled: ImageVector? = null
