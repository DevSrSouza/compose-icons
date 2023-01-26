package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.WifiTetheringError: ImageVector
    get() {
        if (_wifiTetheringError != null) {
            return _wifiTetheringError!!
        }
        _wifiTetheringError = Builder(name = "WifiTetheringError", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.66f, 0.68f, 3.15f, 1.76f, 4.24f)
                lineToRelative(1.42f, -1.42f)
                curveTo(8.45f, 15.1f, 8.0f, 14.11f, 8.0f, 13.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.11f, -0.45f, 2.1f, -1.18f, 2.82f)
                lineToRelative(1.42f, 1.42f)
                curveTo(17.32f, 16.15f, 18.0f, 14.66f, 18.0f, 13.0f)
                curveTo(18.0f, 9.69f, 15.31f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(6.48f, 3.0f, 2.0f, 7.48f, 2.0f, 13.0f)
                curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f)
                lineToRelative(1.42f, -1.42f)
                curveTo(4.9f, 17.21f, 4.0f, 15.21f, 4.0f, 13.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                curveToRelative(2.53f, 0.0f, 4.78f, 1.17f, 6.24f, 3.0f)
                horizontalLineToRelative(2.42f)
                curveTo(18.93f, 5.01f, 15.7f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f)
                curveTo(10.95f, 14.77f, 11.45f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveToRelative(1.05f, -0.23f, 1.41f, -0.59f)
                curveTo(13.77f, 14.05f, 14.0f, 13.55f, 14.0f, 13.0f)
                curveTo(14.0f, 11.9f, 13.1f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _wifiTetheringError!!
    }

private var _wifiTetheringError: ImageVector? = null
