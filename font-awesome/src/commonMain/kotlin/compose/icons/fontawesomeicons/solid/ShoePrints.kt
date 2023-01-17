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

public val SolidGroup.ShoePrints: ImageVector
    get() {
        if (_shoePrints != null) {
            return _shoePrints!!
        }
        _shoePrints = Builder(name = "ShoePrints", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 0.0f)
                curveTo(352.3f, 0.0f, 256.0f, 32.0f, 256.0f, 32.0f)
                verticalLineTo(160.0f)
                curveToRelative(48.0f, 0.0f, 76.0f, 16.0f, 104.0f, 32.0f)
                reflectiveCurveToRelative(56.0f, 32.0f, 104.0f, 32.0f)
                curveToRelative(56.4f, 0.0f, 176.0f, -16.0f, 176.0f, -96.0f)
                reflectiveCurveTo(512.0f, 0.0f, 416.0f, 0.0f)
                close()
                moveTo(128.0f, 96.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                close()
                moveTo(288.0f, 512.0f)
                curveToRelative(96.0f, 0.0f, 224.0f, -48.0f, 224.0f, -128.0f)
                reflectiveCurveToRelative(-119.6f, -96.0f, -176.0f, -96.0f)
                curveToRelative(-48.0f, 0.0f, -76.0f, 16.0f, -104.0f, 32.0f)
                reflectiveCurveToRelative(-56.0f, 32.0f, -104.0f, 32.0f)
                verticalLineTo(480.0f)
                reflectiveCurveToRelative(96.3f, 32.0f, 160.0f, 32.0f)
                close()
                moveTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _shoePrints!!
    }

private var _shoePrints: ImageVector? = null
