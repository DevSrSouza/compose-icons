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

public val SimpleIcons.Runrundotit: ImageVector
    get() {
        if (_runrundotit != null) {
            return _runrundotit!!
        }
        _runrundotit = Builder(name = "Runrundotit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.933f, 10.995f)
                curveToRelative(0.289f, -1.241f, 0.554f, -2.402f, 0.715f, -3.377f)
                curveToRelative(0.293f, -1.762f, 0.364f, -2.985f, 0.28f, -4.197f)
                horizontalLineToRelative(0.134f)
                curveToRelative(2.995f, 0.0f, 4.642f, 1.256f, 4.642f, 3.364f)
                curveToRelative(0.0f, 2.769f, -2.795f, 4.174f, -5.771f, 4.21f)
                close()
                moveTo(21.939f, 18.313f)
                curveToRelative(-0.544f, 0.701f, -1.352f, 1.4f, -2.306f, 1.4f)
                curveToRelative(-1.844f, 0.0f, -3.433f, -2.808f, -3.71f, -6.624f)
                curveToRelative(3.514f, -0.662f, 6.575f, -3.086f, 6.575f, -6.823f)
                curveTo(22.498f, 3.18f, 19.313f, 0.0f, 13.55f, 0.0f)
                curveTo(6.478f, 0.0f, 0.471f, 3.84f, 0.471f, 8.648f)
                curveToRelative(0.0f, 1.696f, 0.886f, 3.249f, 2.396f, 3.249f)
                curveToRelative(0.874f, 0.0f, 1.775f, -0.345f, 2.36f, -1.167f)
                curveToRelative(-0.4f, -0.767f, -0.622f, -1.376f, -0.575f, -2.277f)
                curveToRelative(0.086f, -1.613f, 1.982f, -3.354f, 3.734f, -4.198f)
                curveToRelative(0.029f, 2.846f, -0.402f, 5.014f, -1.105f, 8.305f)
                curveToRelative(-0.755f, 3.537f, -1.747f, 6.57f, -1.747f, 9.087f)
                curveToRelative(0.0f, 1.073f, 0.502f, 2.353f, 1.773f, 2.353f)
                curveToRelative(1.351f, 0.0f, 2.533f, -0.789f, 3.302f, -1.663f)
                curveToRelative(-0.199f, -1.552f, -0.226f, -3.313f, 0.25f, -6.255f)
                arcToRelative(55.23f, 55.23f, 0.0f, false, true, 0.636f, -3.187f)
                curveToRelative(0.43f, 4.649f, 2.332f, 11.045f, 6.867f, 11.045f)
                curveToRelative(2.742f, 0.0f, 5.167f, -1.693f, 5.167f, -3.918f)
                curveToRelative(0.0f, -1.012f, -0.636f, -1.83f, -1.59f, -1.709f)
            }
        }
        .build()
        return _runrundotit!!
    }

private var _runrundotit: ImageVector? = null
