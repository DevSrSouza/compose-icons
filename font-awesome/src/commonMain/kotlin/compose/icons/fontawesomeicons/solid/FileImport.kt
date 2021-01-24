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

public val SolidGroup.FileImport: ImageVector
    get() {
        if (_fileImport != null) {
            return _fileImport!!
        }
        _fileImport = Builder(name = "FileImport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(112.0f)
                verticalLineToRelative(-64.0f)
                close()
                moveTo(505.0f, 105.0f)
                lineTo(407.1f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                lineTo(384.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                close()
                moveTo(352.0f, 136.0f)
                lineTo(352.0f, 0.0f)
                lineTo(152.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(264.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-65.2f)
                curveToRelative(0.0f, -14.3f, 17.3f, -21.4f, 27.4f, -11.3f)
                lineTo(379.0f, 308.0f)
                curveToRelative(6.6f, 6.7f, 6.6f, 17.4f, 0.0f, 24.0f)
                lineToRelative(-95.7f, 96.4f)
                curveToRelative(-10.1f, 10.1f, -27.4f, 3.0f, -27.4f, -11.3f)
                lineTo(255.9f, 352.0f)
                lineTo(128.0f, 352.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(512.0f, 160.0f)
                lineTo(376.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _fileImport!!
    }

private var _fileImport: ImageVector? = null
