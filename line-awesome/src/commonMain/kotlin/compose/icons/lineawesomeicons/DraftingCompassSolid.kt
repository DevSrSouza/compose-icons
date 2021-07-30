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

public val LineAwesomeIcons.DraftingCompassSolid: ImageVector
    get() {
        if (_draftingCompassSolid != null) {
            return _draftingCompassSolid!!
        }
        _draftingCompassSolid = Builder(name = "DraftingCompassSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 6.1563f)
                curveTo(13.2813f, 6.6016f, 12.0f, 8.1484f, 12.0f, 10.0f)
                curveTo(12.0f, 11.0469f, 12.4258f, 12.0f, 13.0938f, 12.7188f)
                lineTo(9.75f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 22.0f)
                lineTo(8.8125f, 22.0f)
                lineTo(5.9688f, 28.1875f)
                lineTo(7.7813f, 29.0313f)
                lineTo(11.0313f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 22.0f)
                lineTo(20.9688f, 22.0f)
                lineTo(24.1875f, 29.0313f)
                lineTo(26.0f, 28.2188f)
                lineTo(23.1563f, 22.0f)
                lineTo(26.0f, 22.0f)
                lineTo(26.0f, 20.0f)
                lineTo(22.25f, 20.0f)
                lineTo(18.9063f, 12.6875f)
                curveTo(19.5664f, 11.9766f, 20.0f, 11.043f, 20.0f, 10.0f)
                curveTo(20.0f, 8.1484f, 18.7188f, 6.6016f, 17.0f, 6.1563f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(17.1172f, 8.0f, 18.0f, 8.8828f, 18.0f, 10.0f)
                curveTo(18.0f, 10.582f, 17.7656f, 11.1016f, 17.375f, 11.4688f)
                lineTo(17.3438f, 11.5f)
                lineTo(16.3438f, 11.9375f)
                lineTo(20.0313f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 20.0f)
                lineTo(11.9375f, 20.0f)
                lineTo(15.625f, 12.0f)
                lineTo(14.625f, 11.5313f)
                lineTo(14.6563f, 11.5f)
                curveTo(14.2422f, 11.1328f, 14.0f, 10.6016f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8828f, 14.8828f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _draftingCompassSolid!!
    }

private var _draftingCompassSolid: ImageVector? = null
