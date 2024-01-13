package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hackerrank: ImageVector
    get() {
        if (_hackerrank != null) {
            return _hackerrank!!
        }
        _hackerrank = Builder(name = "Hackerrank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(9.95f, 8.002f)
                horizontalLineToRelative(1.805f)
                curveToRelative(0.061f, 0.0f, 0.111f, 0.05f, 0.111f, 0.111f)
                verticalLineToRelative(7.767f)
                curveToRelative(0.0f, 0.061f, -0.05f, 0.111f, -0.11f, 0.111f)
                lineTo(9.95f, 15.991f)
                curveToRelative(-0.061f, 0.0f, -0.111f, -0.05f, -0.111f, -0.11f)
                verticalLineToRelative(-2.87f)
                lineTo(7.894f, 13.011f)
                verticalLineToRelative(2.87f)
                curveToRelative(0.0f, 0.06f, -0.05f, 0.11f, -0.11f, 0.11f)
                lineTo(5.976f, 15.991f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.11f, -0.11f)
                lineTo(5.866f, 8.112f)
                curveToRelative(0.0f, -0.06f, 0.05f, -0.11f, 0.11f, -0.11f)
                horizontalLineToRelative(1.806f)
                curveToRelative(0.061f, 0.0f, 0.11f, 0.05f, 0.11f, 0.11f)
                verticalLineToRelative(2.869f)
                lineTo(9.84f, 10.981f)
                verticalLineToRelative(-2.87f)
                curveToRelative(0.0f, -0.06f, 0.05f, -0.11f, 0.11f, -0.11f)
                close()
                moveTo(12.949f, 8.002f)
                horizontalLineToRelative(5.778f)
                curveToRelative(0.061f, 0.0f, 0.111f, 0.05f, 0.111f, 0.11f)
                verticalLineToRelative(7.767f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.11f, 0.112f)
                horizontalLineToRelative(-5.78f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.11f, -0.11f)
                lineTo(12.838f, 8.111f)
                curveToRelative(0.0f, -0.06f, 0.05f, -0.11f, 0.11f, -0.11f)
                close()
            }
        }
        .build()
        return _hackerrank!!
    }

private var _hackerrank: ImageVector? = null
