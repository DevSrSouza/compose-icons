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

public val SolidGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 21.8f, -11.1f, 42.1f, -29.4f, 53.8f)
                lineToRelative(-42.2f, 27.1f)
                curveToRelative(-25.2f, 16.2f, -40.4f, 44.1f, -40.4f, 74.0f)
                lineTo(128.0f, 320.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0.0f, -8.2f, 4.2f, -15.8f, 11.0f, -20.2f)
                lineToRelative(42.2f, -27.1f)
                curveToRelative(36.6f, -23.6f, 58.8f, -64.1f, 58.8f, -107.7f)
                lineTo(304.0f, 160.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                lineTo(144.0f, 32.0f)
                curveTo(73.3f, 32.0f, 16.0f, 89.3f, 16.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(160.0f, 480.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
