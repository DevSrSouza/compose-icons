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

public val IonIcons.TrainSharp: ImageVector
    get() {
        if (_trainSharp != null) {
            return _trainSharp!!
        }
        _trainSharp = Builder(name = "TrainSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                horizontalLineTo(320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-16.0f, 0.0f, -32.0f, 16.0f, -32.0f, 32.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, 23.92f, 160.0f, 80.0f, 160.0f, 80.0f)
                reflectiveCurveToRelative(160.0f, -56.74f, 160.0f, -80.0f)
                verticalLineTo(64.0f)
                curveTo(416.0f, 48.0f, 400.0f, 32.0f, 384.0f, 32.0f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 352.0f)
                close()
                moveTo(368.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(360.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(314.0f, 432.0f)
                lineToRelative(15.32f, 16.0f)
                lineToRelative(-146.74f, 0.0f)
                lineToRelative(15.42f, -16.0f)
                lineToRelative(-32.0f, -13.0f)
                lineToRelative(-76.62f, 77.0f)
                lineToRelative(45.2f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                lineToRelative(210.74f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                lineToRelative(45.3f, 0.0f)
                lineToRelative(-76.36f, -77.75f)
                lineToRelative(-32.26f, 13.75f)
                close()
            }
        }
        .build()
        return _trainSharp!!
    }

private var _trainSharp: ImageVector? = null
