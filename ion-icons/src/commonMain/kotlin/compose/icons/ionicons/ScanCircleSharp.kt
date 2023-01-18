package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ScanCircleSharp: ImageVector
    get() {
        if (_scanCircleSharp != null) {
            return _scanCircleSharp!!
        }
        _scanCircleSharp = Builder(name = "ScanCircleSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(232.0f, 368.0f)
                lineTo(188.0f, 368.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(144.0f, 280.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(232.0f, 176.0f)
                lineTo(188.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(44.0f)
                lineTo(144.0f, 232.0f)
                lineTo(144.0f, 188.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(368.0f, 324.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(280.0f, 368.0f)
                lineTo(280.0f, 336.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(336.0f, 280.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(368.0f, 232.0f)
                lineTo(336.0f, 232.0f)
                lineTo(336.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(280.0f, 176.0f)
                lineTo(280.0f, 144.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                close()
            }
        }
        .build()
        return _scanCircleSharp!!
    }

private var _scanCircleSharp: ImageVector? = null
