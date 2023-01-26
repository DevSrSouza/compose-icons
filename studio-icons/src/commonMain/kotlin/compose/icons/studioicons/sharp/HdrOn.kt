package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.HdrOn: ImageVector
    get() {
        if (_hdrOn != null) {
            return _hdrOn!!
        }
        _hdrOn = Builder(name = "HdrOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.9f)
                lineTo(21.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2.0f)
                lineTo(21.0f, 15.0f)
                lineToRelative(-0.9f, -2.1f)
                horizontalLineToRelative(0.9f)
                close()
                moveTo(19.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.5f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.5f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                lineTo(6.5f, 15.0f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 9.0f)
                lineTo(6.5f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(9.5f, 9.0f)
                verticalLineToRelative(6.0f)
                lineTo(13.0f, 15.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.0f, 13.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _hdrOn!!
    }

private var _hdrOn: ImageVector? = null
