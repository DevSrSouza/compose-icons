package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(7.736f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                lineTo(13.0f, 1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 11.25f, 0.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 1.0f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(3.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(2.5f, 1.75f)
                close()
                moveTo(4.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(4.0f, 7.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.75f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 7.75f)
                close()
                moveTo(15.774f, 11.287f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.048f, -1.074f)
                lineTo(10.7f, 14.145f)
                lineTo(9.281f, 12.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.062f, 1.058f)
                lineToRelative(1.943f, 1.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.055f, 0.008f)
                lineToRelative(4.557f, -4.45f)
                close()
            }
        }
        .build()
        return _checklist16!!
    }

private var _checklist16: ImageVector? = null
