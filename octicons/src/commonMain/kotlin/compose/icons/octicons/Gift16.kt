package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Gift16: ImageVector
    get() {
        if (_gift16 != null) {
            return _gift16!!
        }
        _gift16 = Builder(name = "Gift16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                horizontalLineToRelative(2.309f)
                curveToRelative(-0.233f, -0.818f, -0.542f, -1.401f, -0.878f, -1.793f)
                curveToRelative(-0.43f, -0.502f, -0.915f, -0.707f, -1.431f, -0.707f)
                close()
                moveTo(2.0f, 2.75f)
                curveToRelative(0.0f, 0.45f, 0.108f, 0.875f, 0.3f, 1.25f)
                horizontalLineToRelative(-0.55f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 5.75f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.698f, 0.409f, 1.3f, 1.0f, 1.582f)
                verticalLineToRelative(4.918f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 15.0f, 14.25f)
                lineTo(15.0f, 9.332f)
                curveToRelative(0.591f, -0.281f, 1.0f, -0.884f, 1.0f, -1.582f)
                verticalLineToRelative(-2.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 4.0f)
                horizontalLineToRelative(-0.55f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.45f, -4.0f)
                curveToRelative(-0.984f, 0.0f, -1.874f, 0.42f, -2.57f, 1.23f)
                arcTo(5.086f, 5.086f, 0.0f, false, false, 8.0f, 2.274f)
                arcToRelative(5.086f, 5.086f, 0.0f, false, false, -0.68f, -1.042f)
                curveTo(6.623f, 0.42f, 5.733f, 0.0f, 4.75f, 0.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 2.75f)
                close()
                moveTo(8.941f, 4.0f)
                horizontalLineToRelative(2.309f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                curveToRelative(-0.516f, 0.0f, -1.0f, 0.205f, -1.43f, 0.707f)
                curveToRelative(-0.337f, 0.392f, -0.646f, 0.975f, -0.879f, 1.793f)
                close()
                moveTo(7.101f, 5.5f)
                lineTo(1.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(5.5f)
                lineTo(7.25f, 5.5f)
                horizontalLineToRelative(-0.149f)
                close()
                moveTo(8.75f, 5.5f)
                lineTo(8.75f, 8.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(8.75f, 9.5f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(7.25f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(2.5f, 9.5f)
                horizontalLineToRelative(4.75f)
                close()
            }
        }
        .build()
        return _gift16!!
    }

private var _gift16: ImageVector? = null
