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

public val RoundGroup.MilitaryTech: ImageVector
    get() {
        if (_militaryTech != null) {
            return _militaryTech!!
        }
        _militaryTech = Builder(name = "MilitaryTech", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.43f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 2.0f, 7.0f, 2.45f, 7.0f, 3.0f)
                verticalLineToRelative(7.43f)
                curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f)
                lineToRelative(4.18f, 2.51f)
                lineToRelative(-0.99f, 2.34f)
                lineToRelative(-2.22f, 0.19f)
                curveTo(8.0f, 16.37f, 7.82f, 16.92f, 8.16f, 17.21f)
                lineToRelative(1.69f, 1.46f)
                lineToRelative(-0.51f, 2.18f)
                curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f)
                lineTo(12.0f, 20.23f)
                lineToRelative(1.91f, 1.15f)
                curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f)
                lineToRelative(-0.51f, -2.18f)
                lineToRelative(1.69f, -1.46f)
                curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f)
                lineToRelative(-2.22f, -0.19f)
                lineToRelative(-0.99f, -2.34f)
                lineToRelative(4.18f, -2.51f)
                curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f)
                close()
                moveTo(13.0f, 12.23f)
                lineToRelative(-1.0f, 0.6f)
                lineToRelative(-1.0f, -0.6f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(12.23f)
                close()
            }
        }
        .build()
        return _militaryTech!!
    }

private var _militaryTech: ImageVector? = null
