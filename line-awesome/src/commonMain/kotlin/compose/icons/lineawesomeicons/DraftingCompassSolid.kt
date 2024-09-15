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
                lineTo(15.0f, 6.156f)
                curveTo(13.281f, 6.602f, 12.0f, 8.148f, 12.0f, 10.0f)
                curveTo(12.0f, 11.047f, 12.426f, 12.0f, 13.094f, 12.719f)
                lineTo(9.75f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 22.0f)
                lineTo(8.813f, 22.0f)
                lineTo(5.969f, 28.188f)
                lineTo(7.781f, 29.031f)
                lineTo(11.031f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 22.0f)
                lineTo(20.969f, 22.0f)
                lineTo(24.188f, 29.031f)
                lineTo(26.0f, 28.219f)
                lineTo(23.156f, 22.0f)
                lineTo(26.0f, 22.0f)
                lineTo(26.0f, 20.0f)
                lineTo(22.25f, 20.0f)
                lineTo(18.906f, 12.688f)
                curveTo(19.566f, 11.977f, 20.0f, 11.043f, 20.0f, 10.0f)
                curveTo(20.0f, 8.148f, 18.719f, 6.602f, 17.0f, 6.156f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(17.117f, 8.0f, 18.0f, 8.883f, 18.0f, 10.0f)
                curveTo(18.0f, 10.582f, 17.766f, 11.102f, 17.375f, 11.469f)
                lineTo(17.344f, 11.5f)
                lineTo(16.344f, 11.938f)
                lineTo(20.031f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 20.0f)
                lineTo(11.938f, 20.0f)
                lineTo(15.625f, 12.0f)
                lineTo(14.625f, 11.531f)
                lineTo(14.656f, 11.5f)
                curveTo(14.242f, 11.133f, 14.0f, 10.602f, 14.0f, 10.0f)
                curveTo(14.0f, 8.883f, 14.883f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _draftingCompassSolid!!
    }

private var _draftingCompassSolid: ImageVector? = null
