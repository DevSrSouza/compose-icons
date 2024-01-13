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

public val SimpleIcons.Rarible: ImageVector
    get() {
        if (_rarible != null) {
            return _rarible!!
        }
        _rarible = Builder(name = "Rarible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8f, 0.0f)
                arcTo(4.79f, 4.79f, 0.0f, false, false, 0.0f, 4.8f)
                verticalLineToRelative(14.4f)
                arcTo(4.79f, 4.79f, 0.0f, false, false, 4.8f, 24.0f)
                horizontalLineToRelative(14.4f)
                arcToRelative(4.79f, 4.79f, 0.0f, false, false, 4.8f, -4.8f)
                lineTo(24.0f, 4.8f)
                arcTo(4.79f, 4.79f, 0.0f, false, false, 19.2f, 0.0f)
                close()
                moveTo(6.12f, 7.68f)
                horizontalLineToRelative(8.202f)
                curveToRelative(2.06f, 0.0f, 3.666f, 0.44f, 3.666f, 2.334f)
                curveToRelative(0.0f, 1.137f, -0.671f, 1.702f, -1.427f, 1.898f)
                curveToRelative(0.904f, 0.268f, 1.558f, 1.0f, 1.558f, 2.16f)
                verticalLineToRelative(2.131f)
                horizontalLineToRelative(-3.451f)
                lineTo(14.668f, 14.18f)
                curveToRelative(0.0f, -0.62f, -0.37f, -0.87f, -1.0f, -0.87f)
                lineTo(9.572f, 13.31f)
                verticalLineToRelative(2.893f)
                lineTo(6.12f, 16.203f)
                close()
                moveTo(9.572f, 10.18f)
                verticalLineToRelative(0.834f)
                horizontalLineToRelative(4.155f)
                curveToRelative(0.452f, 0.0f, 0.726f, -0.06f, 0.726f, -0.416f)
                curveToRelative(0.0f, -0.358f, -0.274f, -0.418f, -0.726f, -0.418f)
                close()
            }
        }
        .build()
        return _rarible!!
    }

private var _rarible: ImageVector? = null
