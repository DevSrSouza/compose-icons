package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Backup: ImageVector
    get() {
        if (_backup != null) {
            return _backup!!
        }
        _backup = Builder(name = "Backup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f)
                curveTo(8.78f, 4.0f, 6.07f, 6.18f, 5.26f, 9.15f)
                curveTo(2.82f, 9.71f, 1.0f, 11.89f, 1.0f, 14.5f)
                curveTo(1.0f, 17.54f, 3.46f, 20.0f, 6.5f, 20.0f)
                curveToRelative(1.76f, 0.0f, 10.25f, 0.0f, 12.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(2.49f, -0.01f, 4.5f, -2.03f, 4.5f, -4.52f)
                curveTo(23.0f, 13.15f, 21.25f, 11.26f, 19.0f, 11.0f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.21f)
                curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.35f, -0.85f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.31f, 0.31f, 0.09f, 0.85f, -0.35f, 0.85f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _backup!!
    }

private var _backup: ImageVector? = null
