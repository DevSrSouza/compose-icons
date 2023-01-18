package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ApprovalsApp: ImageVector
    get() {
        if (_approvalsApp != null) {
            return _approvalsApp!!
        }
        _approvalsApp = Builder(name = "ApprovalsApp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7803f, 1.7197f)
                curveTo(11.4874f, 1.4268f, 11.0125f, 1.4268f, 10.7197f, 1.7197f)
                curveTo(10.4268f, 2.0126f, 10.4268f, 2.4875f, 10.7197f, 2.7803f)
                lineTo(11.9396f, 4.0002f)
                curveTo(6.9968f, 4.0327f, 3.0f, 8.0496f, 3.0f, 13.0f)
                curveTo(3.0f, 17.9706f, 7.0294f, 22.0f, 12.0f, 22.0f)
                curveTo(16.6942f, 22.0f, 20.5483f, 18.4068f, 20.9631f, 13.8202f)
                curveTo(21.0004f, 13.4077f, 20.6962f, 13.043f, 20.2837f, 13.0057f)
                curveTo(19.8712f, 12.9684f, 19.5065f, 13.2726f, 19.4692f, 13.6851f)
                curveTo(19.1236f, 17.5058f, 15.9111f, 20.5f, 12.0f, 20.5f)
                curveTo(7.8579f, 20.5f, 4.5f, 17.1421f, 4.5f, 13.0f)
                curveTo(4.5f, 8.8782f, 7.8249f, 5.533f, 11.939f, 5.5002f)
                lineTo(10.7197f, 6.7196f)
                curveTo(10.4268f, 7.0124f, 10.4268f, 7.4873f, 10.7197f, 7.7802f)
                curveTo(11.0126f, 8.0731f, 11.4874f, 8.0731f, 11.7803f, 7.7802f)
                lineTo(14.2803f, 5.2802f)
                curveTo(14.421f, 5.1396f, 14.5f, 4.9488f, 14.5f, 4.7499f)
                curveTo(14.5f, 4.551f, 14.421f, 4.3602f, 14.2803f, 4.2195f)
                lineTo(11.7803f, 1.7197f)
                close()
                moveTo(15.7837f, 10.2197f)
                curveTo(16.0766f, 10.5126f, 16.0766f, 10.9874f, 15.7837f, 11.2803f)
                lineTo(11.2803f, 15.7838f)
                curveTo(11.1397f, 15.9244f, 10.9489f, 16.0034f, 10.75f, 16.0034f)
                curveTo(10.5511f, 16.0035f, 10.3603f, 15.9244f, 10.2197f, 15.7838f)
                lineTo(8.2197f, 13.7838f)
                curveTo(7.9268f, 13.4909f, 7.9268f, 13.016f, 8.2197f, 12.7231f)
                curveTo(8.5126f, 12.4302f, 8.9874f, 12.4302f, 9.2803f, 12.7231f)
                lineTo(10.75f, 14.1928f)
                lineTo(14.723f, 10.2197f)
                curveTo(15.0159f, 9.9268f, 15.4908f, 9.9268f, 15.7837f, 10.2197f)
                close()
            }
        }
        .build()
        return _approvalsApp!!
    }

private var _approvalsApp: ImageVector? = null
