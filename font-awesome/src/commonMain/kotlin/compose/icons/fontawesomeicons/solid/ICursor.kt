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

public val SolidGroup.ICursor: ImageVector
    get() {
        if (_iCursor != null) {
            return _iCursor!!
        }
        _iCursor = Builder(name = "ICursor", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.1f, 29.3f)
                curveTo(-1.4f, 47.0f, 11.7f, 62.4f, 29.3f, 63.9f)
                lineToRelative(8.0f, 0.7f)
                curveTo(70.5f, 67.3f, 96.0f, 95.0f, 96.0f, 128.3f)
                verticalLineTo(224.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(95.7f)
                curveToRelative(0.0f, 33.3f, -25.5f, 61.0f, -58.7f, 63.8f)
                lineToRelative(-8.0f, 0.7f)
                curveTo(11.7f, 449.6f, -1.4f, 465.0f, 0.1f, 482.7f)
                reflectiveCurveToRelative(16.9f, 30.7f, 34.5f, 29.2f)
                lineToRelative(8.0f, -0.7f)
                curveToRelative(34.1f, -2.8f, 64.2f, -18.9f, 85.4f, -42.9f)
                curveToRelative(21.2f, 24.0f, 51.2f, 40.1f, 85.4f, 42.9f)
                lineToRelative(8.0f, 0.7f)
                curveToRelative(17.6f, 1.5f, 33.1f, -11.6f, 34.5f, -29.2f)
                reflectiveCurveToRelative(-11.6f, -33.1f, -29.2f, -34.5f)
                lineToRelative(-8.0f, -0.7f)
                curveTo(185.5f, 444.7f, 160.0f, 417.0f, 160.0f, 383.7f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(128.3f)
                curveToRelative(0.0f, -33.3f, 25.5f, -61.0f, 58.7f, -63.8f)
                lineToRelative(8.0f, -0.7f)
                curveToRelative(17.6f, -1.5f, 30.7f, -16.9f, 29.2f, -34.5f)
                reflectiveCurveTo(239.0f, -1.4f, 221.3f, 0.1f)
                lineToRelative(-8.0f, 0.7f)
                curveTo(179.2f, 3.6f, 149.2f, 19.7f, 128.0f, 43.7f)
                curveToRelative(-21.2f, -24.0f, -51.2f, -40.0f, -85.4f, -42.9f)
                lineToRelative(-8.0f, -0.7f)
                curveTo(17.0f, -1.4f, 1.6f, 11.7f, 0.1f, 29.3f)
                close()
            }
        }
        .build()
        return _iCursor!!
    }

private var _iCursor: ImageVector? = null
