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

public val SharpGroup.RemoveModerator: ImageVector
    get() {
        if (_removeModerator != null) {
            return _removeModerator!!
        }
        _removeModerator = Builder(name = "RemoveModerator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.09f)
                verticalLineTo(5.0f)
                lineToRelative(-8.0f, -3.0f)
                lineTo(6.78f, 3.96f)
                lineToRelative(12.09f, 12.09f)
                curveTo(19.59f, 14.52f, 20.0f, 12.83f, 20.0f, 11.09f)
                close()
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(4.0f, 6.83f)
                verticalLineToRelative(4.26f)
                curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f)
                curveToRelative(1.72f, -0.43f, 3.28f, -1.36f, 4.55f, -2.62f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
            }
        }
        .build()
        return _removeModerator!!
    }

private var _removeModerator: ImageVector? = null
