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

public val SolidGroup.SpellCheck: ImageVector
    get() {
        if (_spellCheck != null) {
            return _spellCheck!!
        }
        _spellCheck = Builder(name = "SpellCheck", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 0.0f)
                curveTo(99.1f, 0.0f, 87.4f, 7.8f, 82.5f, 19.7f)
                lineToRelative(-66.7f, 160.0f)
                lineToRelative(-13.3f, 32.0f)
                curveToRelative(-6.8f, 16.3f, 0.9f, 35.0f, 17.2f, 41.8f)
                reflectiveCurveToRelative(35.0f, -0.9f, 41.8f, -17.2f)
                lineTo(66.7f, 224.0f)
                horizontalLineToRelative(90.7f)
                lineToRelative(5.1f, 12.3f)
                curveToRelative(6.8f, 16.3f, 25.5f, 24.0f, 41.8f, 17.2f)
                reflectiveCurveToRelative(24.0f, -25.5f, 17.2f, -41.8f)
                lineToRelative(-13.3f, -32.0f)
                lineToRelative(-66.7f, -160.0f)
                curveTo(136.6f, 7.8f, 124.9f, 0.0f, 112.0f, 0.0f)
                close()
                moveTo(130.7f, 160.0f)
                lineTo(93.3f, 160.0f)
                lineTo(112.0f, 115.2f)
                lineTo(130.7f, 160.0f)
                close()
                moveTo(256.0f, 32.0f)
                verticalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -23.1f, -9.8f, -43.8f, -25.4f, -58.4f)
                curveToRelative(6.0f, -11.2f, 9.4f, -24.0f, 9.4f, -37.6f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                lineTo(288.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(352.0f, 96.0f)
                lineTo(320.0f, 96.0f)
                lineTo(320.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(320.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(320.0f, 192.0f)
                lineTo(320.0f, 160.0f)
                close()
                moveTo(566.6f, 310.6f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineTo(352.0f, 434.7f)
                lineToRelative(-73.4f, -73.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(96.0f, 96.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(192.0f, -192.0f)
                close()
            }
        }
        .build()
        return _spellCheck!!
    }

private var _spellCheck: ImageVector? = null
