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

public val SolidGroup.PumpMedical: ImageVector
    get() {
        if (_pumpMedical != null) {
            return _pumpMedical!!
        }
        _pumpMedical = Builder(name = "PumpMedical", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.51f, 159.82f)
                lineTo(84.24f, 159.82f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 20.51f, 218.0f)
                lineTo(0.14f, 442.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 63.74f, 69.8f)
                horizontalLineToRelative(192.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 319.61f, 442.0f)
                lineTo(299.24f, 218.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 235.51f, 159.82f)
                close()
                moveTo(239.88f, 333.15f)
                arcToRelative(13.35f, 13.35f, 0.0f, false, true, -13.34f, 13.34f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, -13.33f, 13.33f)
                lineTo(146.54f, 399.82f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, -13.33f, -13.33f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(-40.0f)
                arcToRelative(13.34f, 13.34f, 0.0f, false, true, -13.33f, -13.34f)
                lineTo(79.88f, 306.49f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, 13.33f, -13.34f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-40.0f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, 13.33f, -13.33f)
                horizontalLineToRelative(26.67f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, 13.33f, 13.33f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(13.34f, 13.34f, 0.0f, false, true, 13.34f, 13.34f)
                close()
                moveTo(379.19f, 93.88f)
                lineTo(335.87f, 50.56f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -45.24f, -18.74f)
                lineTo(223.88f, 31.82f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(66.75f)
                lineToRelative(43.31f, 43.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(22.62f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 379.19f, 93.88f)
                close()
            }
        }
        .build()
        return _pumpMedical!!
    }

private var _pumpMedical: ImageVector? = null
