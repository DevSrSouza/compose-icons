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

public val SolidGroup.B: ImageVector
    get() {
        if (_b != null) {
            return _b!!
        }
        _b = Builder(name = "B", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 256.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(192.0f, 480.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -46.5f, -24.8f, -87.3f, -62.0f, -109.7f)
                curveToRelative(18.7f, -22.3f, 30.0f, -51.0f, 30.0f, -82.3f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(160.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 96.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(64.0f, 288.0f)
                horizontalLineToRelative(96.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 416.0f)
                lineTo(64.0f, 288.0f)
                close()
            }
        }
        .build()
        return _b!!
    }

private var _b: ImageVector? = null
