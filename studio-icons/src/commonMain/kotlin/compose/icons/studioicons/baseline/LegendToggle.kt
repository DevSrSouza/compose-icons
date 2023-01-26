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

public val BaselineGroup.LegendToggle: ImageVector
    get() {
        if (_legendToggle != null) {
            return _legendToggle!!
        }
        _legendToggle = Builder(name = "LegendToggle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineToRelative(5.0f, -3.55f)
                lineTo(20.0f, 5.0f)
                lineToRelative(-5.0f, 3.55f)
                lineTo(10.0f, 5.0f)
                lineTo(4.0f, 8.66f)
                lineTo(4.0f, 11.0f)
                lineToRelative(5.92f, -3.61f)
                lineTo(15.0f, 11.0f)
                close()
            }
        }
        .build()
        return _legendToggle!!
    }

private var _legendToggle: ImageVector? = null
