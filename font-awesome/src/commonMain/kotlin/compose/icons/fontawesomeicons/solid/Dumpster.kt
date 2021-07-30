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

public val SolidGroup.Dumpster: ImageVector
    get() {
        if (_dumpster != null) {
            return _dumpster!!
        }
        _dumpster = Builder(name = "Dumpster", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.0f, 160.0f)
                curveToRelative(10.4f, 0.0f, 18.0f, -9.8f, 15.5f, -19.9f)
                lineToRelative(-24.0f, -96.0f)
                curveTo(549.7f, 37.0f, 543.3f, 32.0f, 536.0f, 32.0f)
                horizontalLineToRelative(-98.9f)
                lineToRelative(25.6f, 128.0f)
                lineTo(560.0f, 160.0f)
                close()
                moveTo(272.0f, 32.0f)
                lineTo(171.5f, 32.0f)
                lineToRelative(-25.6f, 128.0f)
                lineTo(272.0f, 160.0f)
                lineTo(272.0f, 32.0f)
                close()
                moveTo(404.5f, 32.0f)
                lineTo(304.0f, 32.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(126.1f)
                lineTo(404.5f, 32.0f)
                close()
                moveTo(16.0f, 160.0f)
                horizontalLineToRelative(97.3f)
                lineToRelative(25.6f, -128.0f)
                lineTo(40.0f, 32.0f)
                curveToRelative(-7.3f, 0.0f, -13.7f, 5.0f, -15.5f, 12.1f)
                lineToRelative(-24.0f, 96.0f)
                curveTo(-2.0f, 150.2f, 5.6f, 160.0f, 16.0f, 160.0f)
                close()
                moveTo(560.0f, 224.0f)
                horizontalLineToRelative(-20.0f)
                lineToRelative(4.0f, -32.0f)
                lineTo(32.0f, 192.0f)
                lineToRelative(4.0f, 32.0f)
                lineTo(16.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(28.0f)
                lineToRelative(20.0f, 160.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(320.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                lineToRelative(20.0f, -160.0f)
                horizontalLineToRelative(28.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _dumpster!!
    }

private var _dumpster: ImageVector? = null
