package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Paychex: ImageVector
    get() {
        if (_paychex != null) {
            return _paychex!!
        }
        _paychex = Builder(name = "Paychex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.118f, 11.891f)
                lineToRelative(-0.868f, -1.766f)
                horizontalLineToRelative(1.263f)
                lineToRelative(0.365f, 0.977f)
                lineToRelative(0.75f, -0.977f)
                lineTo(24.0f, 10.125f)
                lineToRelative(-1.57f, 1.766f)
                lineToRelative(0.919f, 1.994f)
                horizontalLineToRelative(-1.303f)
                lineToRelative(-0.414f, -1.046f)
                lineToRelative(-0.879f, 1.046f)
                horizontalLineToRelative(-1.42f)
                close()
                moveTo(17.211f, 10.125f)
                horizontalLineToRelative(3.108f)
                lineToRelative(-0.197f, 0.967f)
                horizontalLineToRelative(-1.954f)
                lineToRelative(-0.099f, 0.464f)
                horizontalLineToRelative(1.816f)
                lineToRelative(-0.188f, 0.898f)
                horizontalLineToRelative(-1.815f)
                lineToRelative(-0.1f, 0.464f)
                horizontalLineToRelative(1.994f)
                lineToRelative(-0.197f, 0.967f)
                horizontalLineToRelative(-3.158f)
                close()
                moveTo(13.52f, 10.125f)
                horizontalLineToRelative(1.164f)
                lineToRelative(-0.276f, 1.303f)
                horizontalLineToRelative(1.056f)
                lineToRelative(0.276f, -1.303f)
                horizontalLineToRelative(1.165f)
                lineToRelative(-0.79f, 3.76f)
                horizontalLineToRelative(-1.154f)
                lineToRelative(0.305f, -1.49f)
                horizontalLineToRelative(-1.055f)
                lineToRelative(-0.316f, 1.49f)
                lineTo(12.74f, 13.885f)
                close()
                moveTo(12.849f, 12.454f)
                curveToRelative(-0.07f, 0.385f, -0.365f, 1.52f, -1.935f, 1.52f)
                curveToRelative(-1.095f, 0.0f, -1.618f, -0.71f, -1.618f, -1.717f)
                curveToRelative(0.0f, -1.214f, 0.76f, -2.23f, 2.043f, -2.23f)
                curveToRelative(0.839f, 0.0f, 1.589f, 0.364f, 1.608f, 1.49f)
                horizontalLineToRelative(-1.095f)
                curveToRelative(0.01f, -0.356f, -0.158f, -0.553f, -0.513f, -0.553f)
                curveToRelative(-0.642f, 0.0f, -0.878f, 0.74f, -0.878f, 1.273f)
                curveToRelative(0.0f, 0.316f, 0.078f, 0.79f, 0.611f, 0.79f)
                curveToRelative(0.365f, 0.0f, 0.573f, -0.247f, 0.642f, -0.583f)
                close()
                moveTo(7.095f, 12.504f)
                lineTo(6.286f, 10.125f)
                horizontalLineToRelative(1.165f)
                lineToRelative(0.355f, 1.401f)
                lineToRelative(0.918f, -1.401f)
                horizontalLineToRelative(1.362f)
                lineTo(8.25f, 12.493f)
                lineToRelative(-0.286f, 1.392f)
                lineTo(6.809f, 13.885f)
                close()
                moveTo(5.201f, 11.418f)
                lineTo(5.339f, 12.543f)
                horizontalLineToRelative(-0.72f)
                close()
                moveTo(2.724f, 13.885f)
                horizontalLineToRelative(1.184f)
                lineToRelative(0.286f, -0.533f)
                horizontalLineToRelative(1.224f)
                lineToRelative(0.059f, 0.533f)
                horizontalLineToRelative(1.135f)
                lineToRelative(-0.573f, -3.76f)
                lineTo(4.895f, 10.125f)
                close()
                moveTo(1.737f, 11.092f)
                horizontalLineToRelative(0.395f)
                curveToRelative(0.246f, 0.0f, 0.503f, 0.05f, 0.503f, 0.336f)
                curveToRelative(0.0f, 0.246f, -0.158f, 0.424f, -0.622f, 0.424f)
                lineTo(1.58f, 11.852f)
                close()
                moveTo(0.0f, 13.885f)
                horizontalLineToRelative(1.145f)
                lineToRelative(0.237f, -1.135f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.986f, 0.0f, 1.627f, -0.651f, 1.627f, -1.411f)
                curveToRelative(0.0f, -0.83f, -0.444f, -1.214f, -1.134f, -1.214f)
                lineTo(0.789f, 10.125f)
                close()
            }
        }
        .build()
        return _paychex!!
    }

private var _paychex: ImageVector? = null
