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

public val SolidGroup.HatCowboySide: ImageVector
    get() {
        if (_hatCowboySide != null) {
            return _hatCowboySide!!
        }
        _hatCowboySide = Builder(name = "HatCowboySide", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.7f, 135.9f)
                lineToRelative(-10.4f, 57.2f)
                curveToRelative(6.8f, -0.7f, 13.6f, -1.1f, 20.5f, -1.1f)
                horizontalLineToRelative(10.7f)
                curveToRelative(39.4f, 0.0f, 77.8f, 12.1f, 110.1f, 34.7f)
                lineTo(562.4f, 421.8f)
                lineToRelative(35.1f, 24.6f)
                curveToRelative(24.4f, -6.0f, 42.5f, -28.1f, 42.5f, -54.4f)
                curveToRelative(0.0f, -75.8f, -94.7f, -126.6f, -134.6f, -144.7f)
                lineTo(474.0f, 83.9f)
                curveTo(468.2f, 53.8f, 441.8f, 32.0f, 411.1f, 32.0f)
                horizontalLineToRelative(-2.7f)
                curveToRelative(-5.6f, 0.0f, -11.1f, 0.7f, -16.5f, 2.2f)
                lineTo(199.2f, 85.5f)
                curveToRelative(-23.9f, 6.4f, -42.0f, 26.0f, -46.5f, 50.4f)
                close()
                moveTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(544.0f)
                lineTo(265.3f, 252.9f)
                curveToRelative(-26.9f, -18.8f, -58.9f, -28.9f, -91.8f, -28.9f)
                horizontalLineTo(162.9f)
                curveToRelative(-60.6f, 0.0f, -116.0f, 34.2f, -143.1f, 88.4f)
                lineTo(13.5f, 325.0f)
                curveTo(4.6f, 342.7f, 0.0f, 362.3f, 0.0f, 382.2f)
                verticalLineTo(384.0f)
                close()
            }
        }
        .build()
        return _hatCowboySide!!
    }

private var _hatCowboySide: ImageVector? = null
