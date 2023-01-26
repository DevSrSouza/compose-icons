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

public val BaselineGroup.MilitaryTech: ImageVector
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
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(8.43f)
                curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f)
                lineToRelative(4.18f, 2.51f)
                lineToRelative(-0.99f, 2.34f)
                lineToRelative(-3.41f, 0.29f)
                lineToRelative(2.59f, 2.24f)
                lineTo(9.07f, 22.0f)
                lineTo(12.0f, 20.23f)
                lineTo(14.93f, 22.0f)
                lineToRelative(-0.78f, -3.33f)
                lineToRelative(2.59f, -2.24f)
                lineToRelative(-3.41f, -0.29f)
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
