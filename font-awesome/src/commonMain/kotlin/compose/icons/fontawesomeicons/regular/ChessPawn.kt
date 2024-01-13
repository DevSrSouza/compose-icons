package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 152.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 88.0f, 152.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 144.0f, 0.0f)
                close()
                moveTo(256.0f, 272.0f)
                lineTo(243.4f, 272.0f)
                lineToRelative(10.7f, 80.0f)
                lineTo(205.7f, 352.0f)
                lineTo(195.0f, 272.0f)
                lineTo(160.0f, 272.0f)
                lineTo(125.0f, 272.0f)
                lineToRelative(-10.7f, 80.0f)
                lineTo(65.9f, 352.0f)
                lineToRelative(10.7f, -80.0f)
                lineTo(64.0f, 272.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(-15.1f, -20.1f, -24.0f, -45.0f, -24.0f, -72.0f)
                curveTo(40.0f, 85.7f, 93.7f, 32.0f, 160.0f, 32.0f)
                reflectiveCurveToRelative(120.0f, 53.7f, 120.0f, 120.0f)
                curveToRelative(0.0f, 27.0f, -8.9f, 51.9f, -24.0f, 72.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(52.7f, 464.0f)
                lineTo(267.3f, 464.0f)
                lineToRelative(-16.6f, -32.0f)
                lineTo(69.2f, 432.0f)
                lineTo(52.7f, 464.0f)
                close()
                moveTo(260.6f, 384.0f)
                curveToRelative(12.0f, 0.0f, 22.9f, 6.7f, 28.4f, 17.3f)
                lineToRelative(26.5f, 51.2f)
                curveToRelative(3.0f, 5.8f, 4.6f, 12.2f, 4.6f, 18.7f)
                curveToRelative(0.0f, 22.5f, -18.2f, 40.8f, -40.8f, 40.8f)
                lineTo(40.8f, 512.0f)
                curveTo(18.2f, 512.0f, 0.0f, 493.8f, 0.0f, 471.2f)
                curveToRelative(0.0f, -6.5f, 1.6f, -12.9f, 4.6f, -18.7f)
                lineToRelative(26.5f, -51.2f)
                curveTo(36.5f, 390.7f, 47.5f, 384.0f, 59.5f, 384.0f)
                horizontalLineToRelative(201.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
