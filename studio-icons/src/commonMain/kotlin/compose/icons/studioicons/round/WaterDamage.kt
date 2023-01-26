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

public val RoundGroup.WaterDamage: ImageVector
    get() {
        if (_waterDamage != null) {
            return _waterDamage!!
        }
        _waterDamage = Builder(name = "WaterDamage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.33f, 3.6f)
                lineToRelative(-8.36f, 7.53f)
                curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f)
                lineTo(12.67f, 3.6f)
                curveTo(12.29f, 3.26f, 11.71f, 3.26f, 11.33f, 3.6f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f)
                curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0.0f)
                curveTo(13.01f, 11.56f, 14.0f, 13.22f, 14.0f, 14.0f)
                curveTo(14.0f, 15.1f, 13.1f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _waterDamage!!
    }

private var _waterDamage: ImageVector? = null
