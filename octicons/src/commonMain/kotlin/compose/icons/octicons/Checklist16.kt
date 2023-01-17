package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Checklist16: ImageVector
    get() {
        if (_checklist16 != null) {
            return _checklist16!!
        }
        _checklist16 = Builder(name = "Checklist16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 13.25f)
                lineTo(1.0f, 1.75f)
                curveTo(1.0f, 0.784f, 1.784f, 0.0f, 2.75f, 0.0f)
                horizontalLineToRelative(8.5f)
                curveTo(12.216f, 0.0f, 13.0f, 0.784f, 13.0f, 1.75f)
                verticalLineToRelative(7.736f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(15.774f, 11.287f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-4.557f, 4.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.055f, -0.008f)
                lineToRelative(-1.943f, -1.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.062f, -1.058f)
                lineToRelative(1.419f, 1.425f)
                lineToRelative(4.026f, -3.932f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.048f, 1.074f)
                close()
                moveTo(4.75f, 4.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(4.0f, 7.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.75f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 7.75f)
                close()
            }
        }
        .build()
        return _checklist16!!
    }

private var _checklist16: ImageVector? = null
