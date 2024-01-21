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

public val Octicons.Typography24: ImageVector
    get() {
        if (_typography24 != null) {
            return _typography24!!
        }
        _typography24 = Builder(name = "Typography24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.414f, 15.0f)
                lineTo(3.586f, 15.0f)
                lineToRelative(-1.631f, 4.505f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.41f, -0.51f)
                lineToRelative(5.08f, -14.03f)
                arcToRelative(1.463f, 1.463f, 0.0f, false, true, 2.75f, 0.0f)
                lineToRelative(5.08f, 14.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.411f, 0.51f)
                close()
                moveTo(14.946f, 9.902f)
                curveToRelative(0.913f, -1.683f, 2.703f, -2.205f, 4.284f, -2.205f)
                curveToRelative(1.047f, 0.0f, 2.084f, 0.312f, 2.878f, 0.885f)
                curveToRelative(0.801f, 0.577f, 1.392f, 1.455f, 1.392f, 2.548f)
                verticalLineToRelative(8.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.06f)
                lineToRelative(-0.044f, 0.025f)
                curveToRelative(-0.893f, 0.52f, -2.096f, 0.785f, -3.451f, 0.785f)
                curveToRelative(-1.051f, 0.0f, -2.048f, -0.315f, -2.795f, -0.948f)
                curveToRelative(-0.76f, -0.643f, -1.217f, -1.578f, -1.217f, -2.702f)
                curveToRelative(0.0f, -0.919f, 0.349f, -1.861f, 1.168f, -2.563f)
                curveToRelative(0.81f, -0.694f, 2.0f, -1.087f, 3.569f, -1.087f)
                lineTo(22.0f, 12.7f)
                verticalLineToRelative(-1.57f)
                curveToRelative(0.0f, -0.503f, -0.263f, -0.967f, -0.769f, -1.332f)
                curveToRelative(-0.513f, -0.37f, -1.235f, -0.6f, -2.001f, -0.6f)
                curveToRelative(-1.319f, 0.0f, -2.429f, 0.43f, -2.966f, 1.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.318f, -0.716f)
                close()
                moveTo(9.87f, 13.5f)
                lineTo(7.0f, 5.572f)
                lineTo(4.13f, 13.5f)
                close()
                moveTo(22.0f, 14.2f)
                horizontalLineToRelative(-2.77f)
                curveToRelative(-1.331f, 0.0f, -2.134f, 0.333f, -2.593f, 0.726f)
                arcToRelative(1.822f, 1.822f, 0.0f, false, false, -0.644f, 1.424f)
                curveToRelative(0.0f, 0.689f, 0.267f, 1.203f, 0.686f, 1.557f)
                curveToRelative(0.43f, 0.365f, 1.065f, 0.593f, 1.826f, 0.593f)
                curveToRelative(1.183f, 0.0f, 2.102f, -0.235f, 2.697f, -0.581f)
                curveToRelative(0.582f, -0.34f, 0.798f, -0.74f, 0.798f, -1.134f)
                close()
            }
        }
        .build()
        return _typography24!!
    }

private var _typography24: ImageVector? = null
