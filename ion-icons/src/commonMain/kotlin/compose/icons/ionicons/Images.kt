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

public val IonIcons.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(450.29f, 112.0f)
                lineTo(142.0f, 112.0f)
                curveToRelative(-34.0f, 0.0f, -62.0f, 27.51f, -62.0f, 61.33f)
                lineTo(80.0f, 418.67f)
                curveTo(80.0f, 452.49f, 108.0f, 480.0f, 142.0f, 480.0f)
                lineTo(450.0f, 480.0f)
                curveToRelative(34.0f, 0.0f, 62.0f, -26.18f, 62.0f, -60.0f)
                lineTo(512.0f, 173.33f)
                curveTo(512.0f, 139.51f, 484.32f, 112.0f, 450.29f, 112.0f)
                close()
                moveTo(373.14f, 173.34f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, -46.28f, 46.0f)
                arcTo(46.19f, 46.19f, 0.0f, false, true, 373.14f, 173.33f)
                close()
                moveTo(141.59f, 449.34f)
                curveToRelative(-17.0f, 0.0f, -29.86f, -13.75f, -29.86f, -30.66f)
                lineTo(111.73f, 353.85f)
                lineToRelative(90.46f, -80.79f)
                arcToRelative(46.54f, 46.54f, 0.0f, false, true, 63.44f, 1.83f)
                lineTo(328.27f, 337.0f)
                lineToRelative(-113.0f, 112.33f)
                close()
                moveTo(480.0f, 418.67f)
                arcToRelative(30.67f, 30.67f, 0.0f, false, true, -30.71f, 30.66f)
                lineTo(259.0f, 449.33f)
                lineTo(376.08f, 333.0f)
                arcToRelative(46.24f, 46.24f, 0.0f, false, true, 59.44f, -0.16f)
                lineTo(480.0f, 370.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                horizontalLineTo(64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 96.0f)
                verticalLineTo(352.0f)
                arcToRelative(64.11f, 64.11f, 0.0f, false, false, 48.0f, 62.0f)
                verticalLineTo(152.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 72.0f, -72.0f)
                horizontalLineTo(446.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, false, 384.0f, 32.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
