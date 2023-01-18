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

public val IonIcons.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = Builder(name = "School", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -7.94f, -2.11f)
                lineTo(108.0f, 285.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.0f, 6.94f)
                verticalLineTo(368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.23f, 14.0f)
                lineToRelative(144.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.54f, 0.0f)
                lineToRelative(144.0f, -80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 416.0f, 368.0f)
                verticalLineTo(292.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.0f, -6.94f)
                lineTo(263.94f, 365.89f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 368.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(495.92f, 190.5f)
                reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.0f, -12.28f)
                lineToRelative(-224.0f, -128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.88f, 0.0f)
                lineToRelative(-224.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 27.78f)
                lineToRelative(224.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.88f, 0.0f)
                lineTo(461.0f, 221.28f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.0f, 1.74f)
                verticalLineTo(367.55f)
                curveToRelative(0.0f, 8.61f, 6.62f, 16.0f, 15.23f, 16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 496.0f, 368.0f)
                verticalLineTo(192.0f)
                arcTo(14.76f, 14.76f, 0.0f, false, false, 495.92f, 190.5f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
