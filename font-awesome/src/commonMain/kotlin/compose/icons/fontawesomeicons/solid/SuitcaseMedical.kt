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

public val SolidGroup.SuitcaseMedical: ImageVector
    get() {
        if (_suitcaseMedical != null) {
            return _suitcaseMedical!!
        }
        _suitcaseMedical = Builder(name = "SuitcaseMedical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 48.0f)
                lineTo(328.0f, 48.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                lineTo(336.0f, 96.0f)
                lineTo(176.0f, 96.0f)
                lineTo(176.0f, 56.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(128.0f, 56.0f)
                lineTo(128.0f, 96.0f)
                verticalLineToRelative(32.0f)
                lineTo(128.0f, 480.0f)
                lineTo(384.0f, 480.0f)
                lineTo(384.0f, 128.0f)
                lineTo(384.0f, 96.0f)
                lineTo(384.0f, 56.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                lineTo(184.0f, 0.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, 25.1f, -56.0f, 56.0f)
                close()
                moveTo(96.0f, 96.0f)
                lineTo(64.0f, 96.0f)
                curveTo(28.7f, 96.0f, 0.0f, 124.7f, 0.0f, 160.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(96.0f, 480.0f)
                lineTo(96.0f, 96.0f)
                close()
                moveTo(416.0f, 480.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(512.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(416.0f, 96.0f)
                lineTo(416.0f, 480.0f)
                close()
                moveTo(224.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(288.0f, 320.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(240.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(224.0f, 320.0f)
                lineTo(176.0f, 320.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(160.0f, 272.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                lineTo(224.0f, 208.0f)
                close()
            }
        }
        .build()
        return _suitcaseMedical!!
    }

private var _suitcaseMedical: ImageVector? = null
