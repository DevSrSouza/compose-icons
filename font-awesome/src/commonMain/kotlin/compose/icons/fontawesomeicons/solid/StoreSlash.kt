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

public val SolidGroup.StoreSlash: ImageVector
    get() {
        if (_storeSlash != null) {
            return _storeSlash!!
        }
        _storeSlash = Builder(name = "StoreSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-86.8f, -68.0f)
                verticalLineTo(384.0f)
                verticalLineTo(252.6f)
                curveToRelative(-4.0f, 1.0f, -8.0f, 1.8f, -12.3f, 2.3f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(-5.3f, 0.7f, -10.7f, 1.1f, -16.2f, 1.1f)
                curveToRelative(-12.4f, 0.0f, -24.3f, -1.9f, -35.4f, -5.3f)
                verticalLineTo(350.9f)
                lineTo(301.2f, 210.7f)
                curveToRelative(7.0f, -4.4f, 13.3f, -9.7f, 18.8f, -15.7f)
                curveToRelative(15.9f, 17.6f, 39.1f, 29.0f, 65.2f, 29.0f)
                curveToRelative(26.2f, 0.0f, 49.3f, -11.4f, 65.2f, -29.0f)
                curveToRelative(16.0f, 17.6f, 39.1f, 29.0f, 65.2f, 29.0f)
                curveToRelative(4.1f, 0.0f, 8.1f, -0.3f, 12.1f, -0.8f)
                curveToRelative(55.5f, -7.4f, 81.8f, -72.5f, 52.1f, -119.4f)
                lineTo(522.3f, 13.1f)
                curveTo(517.2f, 5.0f, 508.1f, 0.0f, 498.4f, 0.0f)
                horizontalLineTo(141.6f)
                curveToRelative(-9.7f, 0.0f, -18.8f, 5.0f, -23.9f, 13.1f)
                lineToRelative(-22.7f, 36.0f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(514.9f, 501.7f)
                lineTo(365.5f, 384.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(250.6f)
                curveToRelative(-11.2f, 3.5f, -23.2f, 5.4f, -35.6f, 5.4f)
                curveToRelative(-5.5f, 0.0f, -11.0f, -0.4f, -16.3f, -1.1f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(-4.1f, -0.6f, -8.1f, -1.3f, -12.0f, -2.3f)
                verticalLineTo(384.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(480.0f)
                curveToRelative(12.9f, 0.0f, 24.8f, -3.8f, 34.9f, -10.3f)
                close()
                moveTo(155.3f, 218.4f)
                lineTo(48.9f, 134.5f)
                curveToRelative(-6.1f, 40.6f, 19.5f, 82.8f, 63.3f, 88.7f)
                curveToRelative(4.0f, 0.5f, 8.1f, 0.8f, 12.1f, 0.8f)
                curveToRelative(11.0f, 0.0f, 21.4f, -2.0f, 31.0f, -5.6f)
                close()
            }
        }
        .build()
        return _storeSlash!!
    }

private var _storeSlash: ImageVector? = null
