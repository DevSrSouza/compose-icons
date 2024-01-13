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

public val SolidGroup.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = Builder(name = "DoorOpen", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                curveToRelative(0.0f, -9.9f, -4.5f, -19.2f, -12.3f, -25.2f)
                reflectiveCurveTo(289.8f, -1.4f, 280.2f, 1.0f)
                lineToRelative(-179.9f, 45.0f)
                curveTo(79.0f, 51.3f, 64.0f, 70.5f, 64.0f, 92.5f)
                lineTo(64.0f, 448.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(96.0f, 512.0f)
                lineTo(288.0f, 512.0f)
                horizontalLineToRelative(32.0f)
                lineTo(320.0f, 480.0f)
                lineTo(320.0f, 32.0f)
                close()
                moveTo(256.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, -10.7f, 32.0f, -24.0f, 32.0f)
                reflectiveCurveToRelative(-24.0f, -14.3f, -24.0f, -32.0f)
                reflectiveCurveToRelative(10.7f, -32.0f, 24.0f, -32.0f)
                reflectiveCurveToRelative(24.0f, 14.3f, 24.0f, 32.0f)
                close()
                moveTo(352.0f, 128.0f)
                horizontalLineToRelative(96.0f)
                lineTo(448.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(512.0f, 448.0f)
                lineTo(512.0f, 128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(352.0f, 64.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
