package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SheetPlastic: ImageVector
    get() {
        if (_sheetPlastic != null) {
            return _sheetPlastic!!
        }
        _sheetPlastic = Builder(name = "SheetPlastic", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(224.0f, 512.0f)
                lineTo(224.0f, 384.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(384.0f, 352.0f)
                lineTo(384.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                close()
                moveTo(171.3f, 75.3f)
                lineToRelative(-96.0f, 96.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(96.0f, -96.0f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
                moveTo(267.3f, 107.3f)
                lineToRelative(-160.0f, 160.0f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(160.0f, -160.0f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
                moveTo(384.0f, 384.0f)
                lineTo(256.0f, 384.0f)
                lineTo(256.0f, 512.0f)
                lineTo(384.0f, 384.0f)
                close()
            }
        }
        .build()
        return _sheetPlastic!!
    }

private var _sheetPlastic: ImageVector? = null
