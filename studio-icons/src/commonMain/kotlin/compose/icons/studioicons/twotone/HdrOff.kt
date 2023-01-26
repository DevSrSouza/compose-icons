package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.HdrOff: ImageVector
    get() {
        if (_hdrOff != null) {
            return _hdrOff!!
        }
        _hdrOff = Builder(name = "HdrOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2.0f)
                lineTo(21.0f, 15.0f)
                lineToRelative(-0.9f, -2.1f)
                curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                lineTo(16.0f, 9.0f)
                verticalLineToRelative(4.86f)
                lineTo(17.14f, 15.0f)
                horizontalLineToRelative(0.36f)
                close()
                moveTo(17.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 10.5f)
                verticalLineToRelative(0.36f)
                lineToRelative(1.5f, 1.5f)
                lineTo(14.5f, 10.5f)
                curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(1.5f, 1.5f)
                lineTo(13.0f, 10.5f)
                close()
                moveTo(2.51f, 2.49f)
                lineTo(1.45f, 3.55f)
                lineTo(6.9f, 9.0f)
                horizontalLineToRelative(-0.4f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.5f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                lineTo(6.5f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-4.9f)
                lineToRelative(1.5f, 1.5f)
                lineTo(9.5f, 15.0f)
                horizontalLineToRelative(3.4f)
                lineToRelative(7.6f, 7.6f)
                lineToRelative(1.06f, -1.06f)
                close()
            }
        }
        .build()
        return _hdrOff!!
    }

private var _hdrOff: ImageVector? = null
