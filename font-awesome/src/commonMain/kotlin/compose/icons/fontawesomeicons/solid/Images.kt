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

public val SolidGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(160.0f)
                close()
                moveTo(396.0f, 138.7f)
                lineToRelative(96.0f, 144.0f)
                curveToRelative(4.9f, 7.4f, 5.4f, 16.8f, 1.2f, 24.6f)
                reflectiveCurveTo(480.9f, 320.0f, 472.0f, 320.0f)
                horizontalLineTo(328.0f)
                horizontalLineTo(280.0f)
                horizontalLineTo(200.0f)
                curveToRelative(-9.2f, 0.0f, -17.6f, -5.3f, -21.6f, -13.6f)
                reflectiveCurveToRelative(-2.9f, -18.2f, 2.9f, -25.4f)
                lineToRelative(64.0f, -80.0f)
                curveToRelative(4.6f, -5.7f, 11.4f, -9.0f, 18.7f, -9.0f)
                reflectiveCurveToRelative(14.2f, 3.3f, 18.7f, 9.0f)
                lineToRelative(17.3f, 21.6f)
                lineToRelative(56.0f, -84.0f)
                curveTo(360.5f, 132.0f, 368.0f, 128.0f, 376.0f, 128.0f)
                reflectiveCurveToRelative(15.5f, 4.0f, 20.0f, 10.7f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(48.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(0.0f, 106.7f, 0.0f, 120.0f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, 75.1f, 60.9f, 136.0f, 136.0f, 136.0f)
                horizontalLineTo(456.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(136.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, -39.4f, -88.0f, -88.0f)
                verticalLineTo(120.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
