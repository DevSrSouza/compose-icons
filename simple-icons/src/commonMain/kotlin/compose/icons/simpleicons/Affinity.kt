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

public val SimpleIcons.Affinity: ImageVector
    get() {
        if (_affinity != null) {
            return _affinity!!
        }
        _affinity = Builder(name = "Affinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.368f, 1.08f)
                horizontalLineToRelative(3.778f)
                lineToRelative(0.318f, 0.55f)
                horizontalLineToRelative(1.082f)
                lineTo(24.0f, 18.004f)
                verticalLineToRelative(0.001f)
                lineToRelative(-2.036f, 3.47f)
                lineTo(13.69f, 21.475f)
                lineToRelative(0.84f, 1.445f)
                horizontalLineToRelative(-0.365f)
                lineToRelative(-0.84f, -1.446f)
                lineTo(3.057f, 21.474f)
                lineToRelative(-0.526f, -0.923f)
                horizontalLineToRelative(-0.652f)
                lineTo(0.0f, 17.298f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(2.41f, -4.176f)
                lineToRelative(2.23f, -1.288f)
                lineToRelative(3.69f, -6.39f)
                lineToRelative(-0.742f, -1.285f)
                lineTo(9.368f, 1.08f)
                close()
                moveTo(11.592f, 6.732f)
                lineTo(5.066f, 18.008f)
                horizontalLineToRelative(6.25f)
                lineToRelative(-0.723f, -1.246f)
                lineToRelative(6.808f, 0.006f)
                lineToRelative(-5.809f, -10.036f)
                close()
            }
        }
        .build()
        return _affinity!!
    }

private var _affinity: ImageVector? = null
