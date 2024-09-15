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

public val LineAwesomeIcons.HryvniaSolid: ImageVector
    get() {
        if (_hryvniaSolid != null) {
            return _hryvniaSolid!!
        }
        _hryvniaSolid = Builder(name = "HryvniaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.211f, 5.0f)
                curveTo(13.221f, 5.0f, 12.262f, 5.291f, 11.438f, 5.84f)
                lineTo(9.445f, 7.168f)
                lineTo(10.555f, 8.832f)
                lineTo(12.547f, 7.504f)
                curveTo(13.042f, 7.174f, 13.617f, 7.0f, 14.211f, 7.0f)
                lineTo(18.596f, 7.0f)
                curveTo(19.922f, 7.0f, 21.0f, 8.078f, 21.0f, 9.404f)
                curveTo(21.0f, 10.12f, 20.685f, 10.795f, 20.135f, 11.254f)
                lineTo(19.24f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 14.0f)
                lineTo(16.84f, 14.0f)
                lineTo(13.238f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 19.0f)
                lineTo(10.84f, 19.0f)
                lineTo(10.586f, 19.211f)
                curveTo(9.579f, 20.051f, 9.0f, 21.285f, 9.0f, 22.596f)
                curveTo(9.0f, 25.025f, 10.975f, 27.0f, 13.404f, 27.0f)
                lineTo(17.789f, 27.0f)
                curveTo(18.779f, 27.0f, 19.739f, 26.709f, 20.563f, 26.16f)
                lineTo(22.555f, 24.832f)
                lineTo(21.445f, 23.168f)
                lineTo(19.453f, 24.496f)
                curveTo(18.958f, 24.826f, 18.383f, 25.0f, 17.789f, 25.0f)
                lineTo(13.404f, 25.0f)
                curveTo(12.078f, 25.0f, 11.0f, 23.922f, 11.0f, 22.596f)
                curveTo(11.0f, 21.88f, 11.315f, 21.205f, 11.865f, 20.746f)
                lineTo(13.961f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 17.0f)
                lineTo(16.361f, 17.0f)
                lineTo(19.961f, 14.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 12.0f)
                lineTo(22.15f, 12.0f)
                curveTo(22.696f, 11.254f, 23.0f, 10.35f, 23.0f, 9.404f)
                curveTo(23.0f, 6.975f, 21.025f, 5.0f, 18.596f, 5.0f)
                lineTo(14.211f, 5.0f)
                close()
            }
        }
        .build()
        return _hryvniaSolid!!
    }

private var _hryvniaSolid: ImageVector? = null
