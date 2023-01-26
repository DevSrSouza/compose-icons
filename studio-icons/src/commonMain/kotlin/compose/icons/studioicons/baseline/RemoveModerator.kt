package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.RemoveModerator: ImageVector
    get() {
        if (_removeModerator != null) {
            return _removeModerator!!
        }
        _removeModerator = Builder(name = "RemoveModerator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.27f, 21.73f)
                lineToRelative(-3.54f, -3.55f)
                lineTo(5.78f, 5.23f)
                lineTo(2.27f, 1.72f)
                lineTo(1.0f, 2.99f)
                lineTo(3.01f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(2.16f, -0.53f, 4.08f, -1.76f, 5.6f, -3.41f)
                lineTo(21.0f, 23.0f)
                lineToRelative(1.27f, -1.27f)
                close()
                moveTo(13.0f, 9.92f)
                lineToRelative(6.67f, 6.67f)
                curveTo(20.51f, 14.87f, 21.0f, 12.96f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineToRelative(-9.0f, -4.0f)
                lineToRelative(-5.48f, 2.44f)
                lineTo(11.0f, 7.92f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _removeModerator!!
    }

private var _removeModerator: ImageVector? = null
