package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PumpSoap: ImageVector
    get() {
        if (_pumpSoap != null) {
            return _pumpSoap!!
        }
        _pumpSoap = Builder(name = "PumpSoap", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.63f, 160.0f)
                horizontalLineTo(84.37f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -63.74f, 58.21f)
                lineTo(0.27f, 442.21f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 512.0f)
                horizontalLineTo(256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 63.74f, -69.79f)
                lineToRelative(-20.36f, -224.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 235.63f, 160.0f)
                close()
                moveTo(160.0f, 416.0f)
                curveToRelative(-33.12f, 0.0f, -60.0f, -26.33f, -60.0f, -58.75f)
                curveToRelative(0.0f, -25.0f, 35.7f, -75.47f, 52.0f, -97.27f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 168.0f, 260.0f)
                curveToRelative(16.33f, 21.8f, 52.0f, 72.27f, 52.0f, 97.27f)
                curveTo(220.0f, 389.67f, 193.12f, 416.0f, 160.0f, 416.0f)
                close()
                moveTo(379.31f, 94.06f)
                lineTo(336.0f, 50.74f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 290.75f, 32.0f)
                horizontalLineTo(224.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 192.0f, 0.0f)
                horizontalLineTo(128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(66.75f)
                lineToRelative(43.31f, 43.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(22.62f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 379.31f, 94.06f)
                close()
            }
        }
        .build()
        return _pumpSoap!!
    }

private var _pumpSoap: ImageVector? = null
