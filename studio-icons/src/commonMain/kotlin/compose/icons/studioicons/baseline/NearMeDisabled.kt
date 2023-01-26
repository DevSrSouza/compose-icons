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

public val BaselineGroup.NearMeDisabled: ImageVector
    get() {
        if (_nearMeDisabled != null) {
            return _nearMeDisabled!!
        }
        _nearMeDisabled = Builder(name = "NearMeDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.34f)
                lineTo(21.0f, 3.0f)
                lineToRelative(-3.34f, 9.0f)
                lineTo(12.0f, 6.34f)
                close()
                moveTo(22.61f, 19.78f)
                lineTo(4.22f, 1.39f)
                lineTo(2.81f, 2.81f)
                lineToRelative(5.07f, 5.07f)
                lineTo(3.0f, 9.69f)
                verticalLineToRelative(1.41f)
                lineToRelative(7.07f, 2.83f)
                lineTo(12.9f, 21.0f)
                horizontalLineToRelative(1.41f)
                lineToRelative(1.81f, -4.88f)
                lineToRelative(5.07f, 5.07f)
                lineTo(22.61f, 19.78f)
                close()
            }
        }
        .build()
        return _nearMeDisabled!!
    }

private var _nearMeDisabled: ImageVector? = null
