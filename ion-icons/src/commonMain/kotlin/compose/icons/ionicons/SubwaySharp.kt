package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SubwaySharp: ImageVector
    get() {
        if (_subwaySharp != null) {
            return _subwaySharp!!
        }
        _subwaySharp = Builder(name = "SubwaySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.0f, 16.0f)
                lineTo(120.0f, 16.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 96.0f, 40.0f)
                lineTo(96.0f, 376.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(392.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(416.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 392.0f, 16.0f)
                close()
                moveTo(208.0f, 64.0f)
                horizontalLineToRelative(95.55f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 96.0f)
                lineTo(208.45f, 96.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 64.0f)
                close()
                moveTo(179.47f, 351.82f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 28.35f, -28.35f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 179.47f, 351.82f)
                close()
                moveTo(339.47f, 351.82f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 28.35f, -28.35f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 339.47f, 351.82f)
                close()
                moveTo(384.0f, 144.0f)
                verticalLineToRelative(64.0f)
                lineTo(128.0f, 208.0f)
                lineTo(128.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.0f, 416.0f)
                lineToRelative(31.37f, 32.0f)
                lineToRelative(-146.74f, 0.0f)
                lineToRelative(31.37f, -32.0f)
                lineToRelative(-44.0f, 0.0f)
                lineToRelative(-80.57f, 80.0f)
                lineToRelative(45.2f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                lineToRelative(210.74f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                lineToRelative(45.3f, 0.0f)
                lineToRelative(-79.67f, -80.0f)
                lineToRelative(-45.0f, 0.0f)
                close()
            }
        }
        .build()
        return _subwaySharp!!
    }

private var _subwaySharp: ImageVector? = null
