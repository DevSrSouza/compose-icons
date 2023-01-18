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

public val IonIcons.ImagesSharp: ImageVector
    get() {
        if (_imagesSharp != null) {
            return _imagesSharp!!
        }
        _imagesSharp = Builder(name = "ImagesSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 132.0f)
                lineTo(80.0f, 460.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(492.0f, 480.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(512.0f, 132.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(100.0f, 112.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 132.0f)
                close()
                moveTo(373.14f, 173.33f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, -46.28f, 46.0f)
                arcTo(46.19f, 46.19f, 0.0f, false, true, 373.14f, 173.33f)
                close()
                moveTo(111.73f, 449.33f)
                lineTo(111.73f, 353.85f)
                lineToRelative(122.76f, -110.2f)
                lineTo(328.27f, 337.0f)
                lineToRelative(-113.0f, 112.33f)
                close()
                moveTo(480.0f, 449.33f)
                lineTo(259.0f, 449.33f)
                lineToRelative(144.58f, -144.0f)
                lineTo(480.0f, 370.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 0.0f, 52.0f)
                verticalLineTo(396.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(100.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 68.0f, 80.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _imagesSharp!!
    }

private var _imagesSharp: ImageVector? = null
