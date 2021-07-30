package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.EyeSolid: ImageVector
    get() {
        if (_eyeSolid != null) {
            return _eyeSolid!!
        }
        _eyeSolid = Builder(name = "EyeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveTo(7.6641f, 8.0f, 1.25f, 15.3438f, 1.25f, 15.3438f)
                lineTo(0.6563f, 16.0f)
                lineTo(1.25f, 16.6563f)
                curveTo(1.25f, 16.6563f, 7.0977f, 23.3242f, 14.875f, 23.9375f)
                curveTo(15.2461f, 23.9844f, 15.6172f, 24.0f, 16.0f, 24.0f)
                curveTo(16.3828f, 24.0f, 16.7539f, 23.9844f, 17.125f, 23.9375f)
                curveTo(24.9023f, 23.3242f, 30.75f, 16.6563f, 30.75f, 16.6563f)
                lineTo(31.3438f, 16.0f)
                lineTo(30.75f, 15.3438f)
                curveTo(30.75f, 15.3438f, 24.3359f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(18.2031f, 10.0f, 20.2344f, 10.6016f, 22.0f, 11.4063f)
                curveTo(22.6367f, 12.4609f, 23.0f, 13.6758f, 23.0f, 15.0f)
                curveTo(23.0f, 18.6133f, 20.2891f, 21.582f, 16.7813f, 21.9688f)
                curveTo(16.7617f, 21.9727f, 16.7383f, 21.9648f, 16.7188f, 21.9688f)
                curveTo(16.4805f, 21.9805f, 16.2422f, 22.0f, 16.0f, 22.0f)
                curveTo(15.7344f, 22.0f, 15.4766f, 21.9844f, 15.2188f, 21.9688f)
                curveTo(11.7109f, 21.582f, 9.0f, 18.6133f, 9.0f, 15.0f)
                curveTo(9.0f, 13.6953f, 9.3516f, 12.4805f, 9.9688f, 11.4375f)
                lineTo(9.9375f, 11.4375f)
                curveTo(11.7188f, 10.6172f, 13.7734f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(14.3438f, 12.0f, 13.0f, 13.3438f, 13.0f, 15.0f)
                curveTo(13.0f, 16.6563f, 14.3438f, 18.0f, 16.0f, 18.0f)
                curveTo(17.6563f, 18.0f, 19.0f, 16.6563f, 19.0f, 15.0f)
                curveTo(19.0f, 13.3438f, 17.6563f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(7.25f, 12.9375f)
                curveTo(7.0938f, 13.6094f, 7.0f, 14.2852f, 7.0f, 15.0f)
                curveTo(7.0f, 16.7539f, 7.5f, 18.3945f, 8.375f, 19.7813f)
                curveTo(5.8555f, 18.3242f, 4.1055f, 16.5859f, 3.5313f, 16.0f)
                curveTo(4.0117f, 15.5078f, 5.3516f, 14.2031f, 7.25f, 12.9375f)
                close()
                moveTo(24.75f, 12.9375f)
                curveTo(26.6484f, 14.2031f, 27.9883f, 15.5078f, 28.4688f, 16.0f)
                curveTo(27.8945f, 16.5859f, 26.1445f, 18.3242f, 23.625f, 19.7813f)
                curveTo(24.5f, 18.3945f, 25.0f, 16.7539f, 25.0f, 15.0f)
                curveTo(25.0f, 14.2852f, 24.9063f, 13.6016f, 24.75f, 12.9375f)
                close()
            }
        }
        .build()
        return _eyeSolid!!
    }

private var _eyeSolid: ImageVector? = null
