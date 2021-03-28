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

public val Octicons.ShieldLock16: ImageVector
    get() {
        if (_shieldLock16 != null) {
            return _shieldLock16!!
        }
        _shieldLock16 = Builder(name = "ShieldLock16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.533f, 0.133f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.066f, 0.0f)
                lineToRelative(-5.25f, 1.68f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 1.0f, 3.48f)
                lineTo(1.0f, 7.0f)
                curveToRelative(0.0f, 1.566f, 0.32f, 3.182f, 1.303f, 4.682f)
                curveToRelative(0.983f, 1.498f, 2.585f, 2.813f, 5.032f, 3.855f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, 1.33f, 0.0f)
                curveToRelative(2.447f, -1.042f, 4.049f, -2.357f, 5.032f, -3.855f)
                curveTo(14.68f, 10.182f, 15.0f, 8.566f, 15.0f, 7.0f)
                lineTo(15.0f, 3.48f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.217f, -1.667f)
                lineTo(8.533f, 0.133f)
                close()
                moveTo(7.923f, 1.562f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.153f, 0.0f)
                lineToRelative(5.25f, 1.68f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.174f, 0.238f)
                lineTo(13.5f, 7.0f)
                curveToRelative(0.0f, 1.358f, -0.275f, 2.666f, -1.057f, 3.86f)
                curveToRelative(-0.784f, 1.194f, -2.121f, 2.34f, -4.366f, 3.297f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.154f, 0.0f)
                curveToRelative(-2.245f, -0.956f, -3.582f, -2.104f, -4.366f, -3.298f)
                curveTo(2.775f, 9.666f, 2.5f, 8.36f, 2.5f, 7.0f)
                lineTo(2.5f, 3.48f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.174f, -0.237f)
                lineToRelative(5.25f, -1.68f)
                close()
                moveTo(9.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.75f, 1.3f)
                verticalLineToRelative(2.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(7.25f, 7.8f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.5f, 6.5f)
                close()
            }
        }
        .build()
        return _shieldLock16!!
    }

private var _shieldLock16: ImageVector? = null
