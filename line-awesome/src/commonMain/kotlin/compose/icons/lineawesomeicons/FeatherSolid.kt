package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FeatherSolid: ImageVector
    get() {
        if (_featherSolid != null) {
            return _featherSolid!!
        }
        _featherSolid = Builder(name = "FeatherSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 4.0f)
                curveTo(19.698f, 4.0f, 18.0209f, 4.7255f, 16.7969f, 6.0215f)
                lineTo(8.6367f, 14.1758f)
                curveTo(6.9367f, 15.8748f, 6.0f, 18.1341f, 6.0f, 20.5391f)
                lineTo(6.0f, 22.0f)
                lineTo(8.0273f, 19.9727f)
                curveTo(8.1593f, 18.3167f, 8.8638f, 16.7768f, 10.0508f, 15.5898f)
                lineTo(18.2305f, 7.4141f)
                curveTo(19.0925f, 6.5011f, 20.254f, 6.0f, 21.5f, 6.0f)
                curveTo(23.981f, 6.0f, 26.0f, 8.019f, 26.0f, 10.5f)
                curveTo(26.0f, 11.746f, 25.4985f, 12.9061f, 24.5645f, 13.7891f)
                lineTo(22.5332f, 15.8223f)
                lineTo(19.0f, 17.0f)
                lineTo(21.3555f, 17.0f)
                lineTo(17.5371f, 20.8203f)
                lineTo(14.0f, 22.0f)
                lineTo(16.3535f, 22.0f)
                curveTo(15.0379f, 23.2879f, 13.3054f, 24.0f, 11.4609f, 24.0f)
                lineTo(9.4141f, 24.0f)
                lineTo(18.707f, 14.707f)
                lineTo(17.293f, 13.293f)
                lineTo(4.0f, 26.5859f)
                lineTo(5.4141f, 28.0f)
                lineTo(7.4141f, 26.0f)
                lineTo(11.4609f, 26.0f)
                curveTo(13.8649f, 26.0f, 16.1252f, 25.0643f, 17.8242f, 23.3633f)
                lineTo(25.957f, 15.2227f)
                curveTo(27.275f, 13.9787f, 28.0f, 12.302f, 28.0f, 10.5f)
                curveTo(28.0f, 6.916f, 25.084f, 4.0f, 21.5f, 4.0f)
                close()
            }
        }
        .build()
        return _featherSolid!!
    }

private var _featherSolid: ImageVector? = null
