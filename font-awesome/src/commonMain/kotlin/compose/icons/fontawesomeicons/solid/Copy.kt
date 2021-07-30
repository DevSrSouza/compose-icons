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

public val SolidGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 448.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                lineTo(0.0f, 120.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(296.0f)
                curveToRelative(0.0f, 30.879f, 25.121f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(168.0f)
                close()
                moveTo(320.0f, 104.0f)
                lineTo(320.0f, 0.0f)
                lineTo(152.0f, 0.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(368.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(448.0f, 128.0f)
                lineTo(344.0f, 128.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(440.971f, 72.971f)
                lineTo(375.029f, 7.029f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 358.059f, 0.0f)
                lineTo(352.0f, 0.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(-6.059f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -7.029f, -16.97f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
