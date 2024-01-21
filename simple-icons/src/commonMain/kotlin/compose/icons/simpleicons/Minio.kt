package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Minio: ImageVector
    get() {
        if (_minio != null) {
            return _minio!!
        }
        _minio = Builder(name = "Minio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2072f, 0.006f)
                curveToRelative(-0.6216f, -0.0478f, -1.2f, 0.1943f, -1.6211f, 0.582f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, -0.0938f, 3.0352f)
                lineToRelative(3.4082f, 3.5507f)
                arcToRelative(3.042f, 3.042f, 0.0f, false, true, -0.664f, 4.6875f)
                lineToRelative(-0.463f, 0.2383f)
                lineTo(13.7735f, 7.2853f)
                arcToRelative(15.4198f, 15.4198f, 0.0f, false, false, -8.0174f, 10.4862f)
                verticalLineToRelative(0.0176f)
                lineToRelative(6.5487f, -3.3281f)
                verticalLineToRelative(7.621f)
                lineTo(13.7794f, 24.0f)
                lineTo(13.7794f, 13.6817f)
                lineToRelative(0.8965f, -0.4629f)
                arcToRelative(4.4432f, 4.4432f, 0.0f, false, false, 1.2207f, -7.0292f)
                lineToRelative(-3.371f, -3.5254f)
                arcToRelative(0.7489f, 0.7489f, 0.0f, false, true, 0.037f, -1.0547f)
                arcToRelative(0.7522f, 0.7522f, 0.0f, false, true, 1.0567f, 0.0371f)
                lineToRelative(0.4668f, 0.4863f)
                lineToRelative(-0.006f, 0.0059f)
                lineToRelative(4.0704f, 4.2441f)
                arcToRelative(0.0566f, 0.0566f, 0.0f, false, false, 0.082f, 0.0f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, false, 0.0f, -0.0703f)
                lineToRelative(-3.1406f, -5.1425f)
                lineToRelative(-0.1484f, 0.1425f)
                lineToRelative(0.1484f, -0.1445f)
                curveTo(14.4945f, 0.3926f, 13.8287f, 0.0538f, 13.2072f, 0.006f)
                close()
                moveTo(12.3048f, 9.8712f)
                verticalLineToRelative(2.9941f)
                lineToRelative(-4.1523f, 2.1484f)
                arcToRelative(13.9787f, 13.9787f, 0.0f, false, true, 2.7676f, -3.9277f)
                arcToRelative(14.1784f, 14.1784f, 0.0f, false, true, 1.3847f, -1.2148f)
                close()
            }
        }
        .build()
        return _minio!!
    }

private var _minio: ImageVector? = null
